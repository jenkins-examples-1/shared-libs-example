def call() {
 def result =  libraryResource 'test.sh'
 echo result
 writeFile file: "test.sh", text: result, encoding: "UTF-8"
 sh "chmod +x ${WORKSPACE}/test.sh"
 sh "${WORKSPACE}/test.sh"
}
