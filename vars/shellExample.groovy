def call() {
  def result =  libraryResource 'test.sh'
  echo result
  sh(script: result)
}
