def call(repoName){
  def pom = readMavenPom file: 'pom.xml'
  def version = pom.version
  def artifactId = pom.artifactId
  def groupId = pom.groupID
  // def repoName = "ai-leads"
  // if(version.endsWith("SNAPSHOT")){
  //     repoName = "ai-leads-snapshot"
  // }
  nexusArtifactUploader artifacts: [[artifactId: artifactId, classifier: '', file: "target/${artifactId}.war", type: 'war']], credentialsId: 'nexus3', groupId: groupId, nexusUrl: '172.31.15.204:8081', nexusVersion: 'nexus3', protocol: 'http', repository: "${repoName}", version: version
}
