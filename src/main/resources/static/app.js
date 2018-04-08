
var mainApp = angular.module('myApp',[]);

mainApp.controller("matchNullController", function($scope){
    $scope.match = function() {
        var str = $scope.code.trim();
        var filter1 = new Array("空","没","无");
        var filter2 = new Array("-","—")
        var flag = true;
        if(str==""){
            alert("输入不合法");
            flag = false;
            return;
        }
        angular.forEach(filter1, function(item){
            if (str==item){
                alert("输入不合法");
                flag = false;
                return;
            }
        })
        angular.forEach(filter2, function(item){
            if (str.indexOf(item)!=-1){
                alert("输入不合法");
                flag = false;
                return;
            }
        })

        if (flag){
            alert("合法");
        }


    }
});