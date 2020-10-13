package bbrow.services

import bbrow.maven.*

class MavenCompileService implements MavenCompileInterface {

    String compile(){

        String result="mvn compile".execute().text

        return result
    }
}