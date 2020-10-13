package bbrow.maven


class MavenCompile{

    mavencompileInterface service

    public MavenCompile(mavencompileInterface service){
        this.service = service
    }

    String compile(){
        service.compile()
    }

}