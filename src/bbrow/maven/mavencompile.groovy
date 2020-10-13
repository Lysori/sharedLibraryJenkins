package bbrow.maven

import bbrow.maven.MavenCompileInterface

class MavenCompile{

    MavenCompileInterface service

    public MavenCompile(MavenCompileInterface service){
        this.service = service
    }

    String compile(){
        service.compile()
    }

}