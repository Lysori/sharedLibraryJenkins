package bbrow.services

import bbrow.maven.*

class MavenCompileService implements MavencompileInterface {

    String compile(){

        String result="mvn compile".execute().text

        return result
    }
}