
$(document).ready(function(){

    //"clean code" :)
    $('#nav-home').click(function(){
        $('#menu-employee').hide();
        $('#menu-customer').hide();
        $('#menu-service').hide();
        $('#menu-contract').hide();
    });

    $('#nav-employee').click(function(){
        $('#menu-employee').show();
        $('#menu-customer').hide();
        $('#menu-service').hide();
        $('#menu-contract').hide();
    });

    $('#nav-customer').click(function(){
        $('#menu-customer').show();
        $('#menu-employee').hide();
        $('#menu-service').hide();
        $('#menu-contract').hide();
    });

    $('#nav-service').click(function(){
        $('#menu-service').show();
        $('#menu-employee').hide();
        $('#menu-customer').hide();
        $('#menu-contract').hide();
    });

    $('#nav-contract').click(function(){
        $('#menu-contract').show();
        $('#menu-service').hide();
        $('#menu-employee').hide();
        $('#menu-customer').hide();
    });

    

});