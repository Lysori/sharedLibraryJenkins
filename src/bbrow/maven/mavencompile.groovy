package bbrow.maven


class mavenCompile{

    mavencompileInterface service

    public mavenCompile(mavencompileInterface service){
        this.service = service
    }

    String compile(){
        service.compile()
    }

}