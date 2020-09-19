pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob ( 'newJob' )

pipelineJob('theme-park-job') {
	definition {
		cpsScm {
			scm {
				git {
					remote {
						url 'https://github.com/2002batman/spring-boot-api-example.git'
					}
					branch 'master'
					scriptPath 'Jenkinsfile-docker'
				}
			}
		}
	}
}