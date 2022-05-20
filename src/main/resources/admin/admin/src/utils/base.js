const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot066l2/",
            name: "springboot066l2",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "养老院医疗护理系统"
        } 
    }
}
export default base
