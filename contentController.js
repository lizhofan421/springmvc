/** 广告控制层 */
app.controller("contentController",function($scope,$controller, baseService){

    /** 指定继承baseController */
    $controller('baseController',{$scope:$scope});

    /** 根据广告分类id查询广告内容 */
    $scope.findContentByCategoryId = function(categoryId){
        baseService.sendGet("/content/findContentByCategoryId?categoryId="
            + categoryId).then(
            function(response){
                $scope.contentList = response.data;
            }
        );
    };

    $scope.search = function(){
        var keyword = $scope.keywords ? $scope.keywords : "";
        location.href = "http://search.pinyougou.com?keywords=" + keyword;
    };

});