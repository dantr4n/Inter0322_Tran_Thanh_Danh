
$(document).ready(function(){

    //"clean code" :)
    // $('#nav-home').click(function(){
    //     $('#home').show();
    //     $('#employee-container').hide();
    //     $('#customer-container').hide();
    //     $('#service-container').hide();
    //     $('#contract-container').hide();
    // });

    // $('#nav-employee').click(function(){
    //     $('#employee-container').show();
    //     $('#home').hide();
    //     $('#customer-container').hide();
    //     $('#service-container').hide();
    //     $('#contract-container').hide();
    // });

    // $('#nav-customer').click(function(){
    //     $('#home').hide();
    //     $('#employee-container').hide();
    //     $('#customer-container').show();
    //     $('#service-container').hide();
    //     $('#contract-container').hide();
    // });

    // $('#nav-service').click(function(){
    //     $('#home').hide();
    //     $('#employee-container').hide();
    //     $('#customer-container').hide();
    //     $('#service-container').show();
    //     $('#contract-container').hide();
    // });

    // $('#nav-contract').click(function(){
    //     $('#home').hide();
    //     $('#employee-container').hide();
    //     $('#customer-container').hide();
    //     $('#service-container').hide();
    //     $('#contract-container').show();
    // });

    $('#display-employee-link').click(function () {
        $('#table-employee').removeClass('d-none');
        $('#form-create-employee').addClass('d-none');
    });

    $('#create-employee-link').click(function () {
        $('#form-create-employee').removeClass('d-none');
        $('#table-employee').addClass('d-none');
    });

})

function onDelete(idEmployeeDelete) {
    document.getElementById("idEmployeeDelete").value = idEmployeeDelete;
}

function onUpdate(idEmployeeUpdate) {
    document.getElementById("idEmployeeUpdate").value = idEmployeeUpdate;
}