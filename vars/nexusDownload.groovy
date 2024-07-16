def call(groupId,repoName,artifactId,version){
  sh "curl -u admin:admin -O http://13.233.120.199:8081/repository/${repoName}/${groupId}/${artifactId}/${version}/${artifactId}.war"
}
