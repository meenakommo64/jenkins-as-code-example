pipelineJob('p5-jobdslWithPL') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('')
              name('')
              refspec('')
              url('https://github.com/muatik/jenkins-as-code-example')
            }
          }
          branches {
            branchSpec {
              name('*/master')
            }
          }
          browser {
            gitWeb {
              repoUrl('')
            }
          }
          gitTool('')
          doGenerateSubmoduleConfigurations(false)
        }
      }
      scriptPath('Jenkinsfile')
      lightweight(true)
    }
  }
}
