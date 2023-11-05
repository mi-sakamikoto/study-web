$(document).ready(function(){



    $.ajax({
        type : "get",
        url : "/web/getProvince",
        data : "t=" + new Date().getTime(),
        async : true,
        success : function(data){
            let json = JSON.parse(data);
            var html = "<option value=''>--请选择省份--</option>";
            for (let i = 0; i < json.length; i++){
                let area = json[i]
                html += "<option value='"+area.code+"'>"+area.name+"</option>"
            }
            $("#province").html(html);
        }
    })

$("#province").change(function(){
    $.ajax({
        type : "get",
        url : "/web/getCity?t=" + new Date().getTime() + "&pcode=" + this.value,
        async : true,
        success : function(data){
            let json = JSON.parse(data);
            var html = "<option value=''>--请选择市--</option>";
            for (let i = 0; i < json.length; i++){
                let area = json[i]
                html += "<option value='"+area.code+"'>"+area.name+"</option>"
            }
                 $("#city").html(html);
            }
        })
    })
})