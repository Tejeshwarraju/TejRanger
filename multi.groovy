multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/com.mybank.online.git')
        }
    }
   
  definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))
            sandbox()
        }
    }
    steps {
        steps {
        shell('python myscript.py')
    }
    }
}
