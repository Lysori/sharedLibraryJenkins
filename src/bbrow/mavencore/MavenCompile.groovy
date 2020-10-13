package bbrow.mavencore

class MavenCompile{

    MavenInterface service

    public MavenCompile(MavenInterface service){
        this.service = service
    }
    
    String compile(){
        service.compile()
    }

}