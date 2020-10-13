import bbrow.maven*
import bbrow.services*

def version(){

String test="mvn --version".execute().text
println test

}

def compile(){

def service = new MavenCompileService()
MavenCompile mc = new MavenCompile(service)

String s=mc.compile()
println s

}