package bbrow.services

import bbrow.maven.*

class mavencompileService implements mavencompileInterface {

    String compile(){

        String result="mvn compile".execute().text

        return result
    }
}