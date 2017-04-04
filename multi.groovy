multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/com.mybank.online.git')
        }
    }
   orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    steps {
        steps {
        shell('python myscript.py')
    }
    }
}
