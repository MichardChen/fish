$(function () {
    $("#jqGrid").jqGrid({
        url: '../tbrandseries/list?queryBrand=0',
        datatype: "json",
        colModel: [			
			{ label: '消息内容', name: 'carSerial', width: 80 }, 			
			{ label: '消息类型', name: 'flg', width: 80 },
			{ label: '创建者', name: 'createBy', width: 80 }, 	
			{ label: '创建时间', name: 'createTime', width: 80 }, 	
			{ label: '更新者', name: 'updateBy', width: 80 },
			{ label: '更新时间', name: 'updateTime', width: 80 } 			
        ],
		viewrecords: true,
        height: 400,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		
	},
	created: function() {
		$.get("../tbrand/queryAllBrand", function(r){
			//var r =eval('('+rr+')');
	        var list = r.tBrandList;
	    	if(r.code === 0){
	    		var html = "";
	    		for(var b in list){
	    			//向品牌下拉框添加品牌
	    			html += "<option value='" + list[b].id + "'>" +list[b].brand + "</option>";
	    		}
	    		 $("#brand").append(html);
	    }});
	},
	methods: {
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			
			location.href = "tbrandseries_add.html?id="+id;
		},
		search:function(event){
			var queryBrand = $("#brand").val();
			$("#jqGrid").jqGrid('setGridParam',{ 
                url:"../tbrandseries/list", 
                postData:{'queryBrand':queryBrand}, //发送数据 
                page:1 
            }).trigger("reloadGrid"); 
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要下架？', function(){
				$.ajax({
					type: "POST",
				    url: "../tbrandseries/delete",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		}
	}
});