package bbrow.maven

class MavenCompile{

    MavenCompileInterface service

    public MavenCompile(MavenCompileInterface service){
        this.service = service
    }

    String compile(){
        service.compile()
    }

}