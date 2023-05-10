def call() {
  def result =  libraryResource 'test.sh'
  sh result.toString()
}
