def call(def config) {
  def containerId = (env.JOB_NAME + env.BUILD_NUMBER).toLowerCase()
sh """
docker build --tag ${config.imageName} --target testing .
docker run --name ${containerId} -d
docker cp ${containerId}: ${env.WORKSPACE}/tests build/tests
docker stop ${containerId}
docker rm -f ${containerId}
"""
}
