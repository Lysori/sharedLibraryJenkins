import bbrow.maven.*
import bbrow.services.*

def version(){

String test="mvn --version".execute().text
println test

}

def compile(){

def service = new mavencompileService()
mavencompile mc = new mavencompile(service)

String s=mc.compile()
println s

}