multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/com.mybank.online.git')
        }
    }
   
    steps {
        steps {
        shell('python myscript.py')
    }
    }
}
