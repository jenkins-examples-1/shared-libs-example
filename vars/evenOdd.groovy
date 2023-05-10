def call (def config) {
  if(BUILD_NUMBER.toInteger() % 2 == 0) {
    return true;
  }
  return false;
}
