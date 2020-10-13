import bbrow.mavencore.*
import bbrow.services.*

def version(){

String test="mvn --version".execute().text
println test

}

def compile(){

   def service = new MavenService()
    MavenCompile mc = new MavenCompile(service)
    String c=mc.compile()
    println c

}