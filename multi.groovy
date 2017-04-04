multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/TejRanger.git')
            credentialsId('')
            includes('*')
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
