package bbrow.services

import bbrow.mavencore.*

class MavenService implements MavenInterface{

    String compile(){
        String result="mvn compile".execute().text

        return result
    }
}