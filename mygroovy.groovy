pipeline ("MultiBranchSeedJob")
{
scm {'https://github.com/Tejeshwarraju/TejRanger.git', 'master'}
}
steps
{
step
{
shell('python myscript.py')
}
}
