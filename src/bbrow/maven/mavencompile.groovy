package bbrow.maven


class MavenCompile{

    MavencompileInterface service

    public MavenCompile(MavencompileInterface service){
        this.service = service
    }

    String compile(){
        service.compile()
    }

}