pipelineJob('example') {
   scm {
        git('https://github.com/Tejeshwarraju/com.mybank.online.git', 'master')
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
