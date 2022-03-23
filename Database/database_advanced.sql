-- Cau 21
create view `v_nhan_vien` as select distinct nv.* from nhan_vien nv
left join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien
where (dia_chi like "%Hải Châu%")
and (date(hd.ngay_lam_hop_dong) like "2019-12-12%");

drop view `v_nhan_vien`;

-- Cau 22
update `v_nhan_vien`
set dia_chi = "Liên Chiểu";

-- Cau 23
DELIMITER //
create procedure sp_xoa_khach_hang(maKhachHang int)
begin
	delete from khach_hang kh
    where kh.ma_khach_hang = maKhachHang;
end //
DELIMITER ;

call sp_xoa_khach_hang(1);

-- Cau 24
DELIMITER //
create procedure sp_them_moi_hop_dong(maHopDong int, ngayLamHopDong datetime, ngayKetThuc datetime,
										tienDatCoc double, maNhanVien int, maKhachHang int, maDichVu int)
begin
	if (maHopDong in (select ma_hop_dong from hop_dong)) then
		signal sqlstate '45000' set message_text = "Mã hợp đồng đã tồn tại.";
	end if;
    if (ngayLamHopDong > ngayKetThuc) then
		signal sqlstate '45000' set message_text = "Ngày làm hợp đồng không được phép lớp hơn ngày kết thúc.";
	end if;
    if (maNhanVien not in (select ma_nhan_vien from nhan_vien)) then
		signal sqlstate '45000' set message_text = "Mã nhân viên không tồn tại.";
	end if;
    if (maKhachHang not in (select ma_khach_hang from khach_hang)) then
		signal sqlstate '45000' set message_text = "Mã khách hàng không tồn tại.";
	end if;
    if (maDichVu not in (select ma_dich_vu from dich_vu)) then
		signal sqlstate '45000' set message_text = "Mã dịch vụ không tồn tại.";
	end if;
    insert into hopdong
    values (maHopDong, ngayLamHopDong, ngayKetThuc, tienDatCoc, maNhanVien, maKhachHang, maDichVu);
end //
DELIMITER ;

call sp_them_moi_hop_dong(1, '2022-03-23', '2022-03-30', 0, 1, 1, 1);

-- Cau 25
-- SELECT "message display" AS LOG INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt';
drop trigger if exists tr_xoa_hop_dong;
DELIMITER //
create trigger tr_xoa_hop_dong after delete on hop_dong 
for each row
begin
	select concat("Còn lại ", (select count(*) as hd_con_lai from hop_dong), " hợp đồng.") 
		AS LOG INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt';
end //
DELIMITER ;

 delete from hop_dong where ma_hop_dong = 8;
 insert into hop_dong value (8,	'2021-06-17',	'2021-06-18',	150000,	3,	4,	1);

-- Cau 26
DELIMITER //
create trigger tr_cap_nhat_hop_dong before update on hop_dong
for each row
begin
	if (new.ngay_ket_thuc - new.ngay_lam_hop_dong < 2) then
		signal sqlstate '45000' set message_text = "Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.";
	end if;
end //
DELIMITER ;

drop trigger if exists tr_cap_nhat_hop_dong;

update hop_dong set ngay_ket_thuc = '2021-06-20' where ma_hop_dong = 8;

-- Cau 27
-- a
DELIMITER //
create function func_dem_dich_vu()
returns int
deterministic
begin
    
end //
DELIMITER ;


-- Cau 28
Delimiter //
drop procedure if exists sp_xoa_dich_vu_va_hd_room;
create procedure sp_xoa_dich_vu_va_hd_room()
begin
	drop table if exists tmp_table;
	create table tmp_table(ma_hop_dong int, ma_dich_vu int);
	insert into tmp_table Select ma_hop_dong, dv.ma_dich_vu from hop_dong hd left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
										inner join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
							where (ten_loai_dich_vu = "Room") and (year(ngay_lam_hop_dong) in (2015, 2016, 2017, 2018, 2019));
	delete from hop_dong_chi_tiet where ma_hop_dong in (select ma_hop_dong from tmp_table);
    delete from hop_dong where ma_hop_dong in (select ma_hop_dong from tmp_table);
    delete from dich_vu where ma_dich_vu in (select ma_dich_vu from tmp_table);
end //
delimiter ;

call sp_xoa_dich_vu_va_hd_room();





