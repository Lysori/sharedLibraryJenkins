
def version(){

String test="mvn --version".execute().text
println test

}

def compile(){

String compile="mvn compile".execute().text
println compile

}