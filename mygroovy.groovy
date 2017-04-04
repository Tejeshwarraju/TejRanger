#!groovy
freeStyleJob('Seedjobchild') {
    
    scm {
        git('https://github.com/Tejeshwarraju/TejRanger.git', 'master')
    }
  
    steps {
        steps {
        shell('python myscript.py')
    }
    }
   
}
