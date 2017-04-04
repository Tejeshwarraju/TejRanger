multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/TejRanger.git')
            credentialsId('')
            includes('mas*')
        }
    }
   orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    
}
