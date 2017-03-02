
分析算法时间复杂度时，把注意力集中到关键的操作上。
几种渐进符号

 
大写O符号
f(n)=O(g(n))，这里f(n)是分析出来算法的执行次数的函数，
O的定义:当且仅当存在正的常数c和n0，使得对于所有的n>=n0，有f(n)<=cg(n)。
这里cg(n)就是函数f(n)的上限。

几种函数的例子:
1.线性函数
f(n)=3n+2，当n>=2时，3n+2<=3n+n=4n。所以f(n)=O(n)，这里c就是4，n0=2。
2.平方函数
f(n)=2n^2+3n+3，当n>=3时，3n+3<=4n，当n>=4时，4n<n^2，f(n)=2n^2+n^2=3n^2。
f(n)=O(n^2)，这里c是3，n0=4。
3.指数函数
f(n)=6*2^n+n^2，当n>=4时，n^2<=2^n，所以当n>=4，有f(n)<=6*2^n+2^n=7*2^n。
这里c是7，n0=4，f(n)=O(2^n)。
4.常数阶
f(n)=9，这里就直接记为O(1)，c为9，n0为0就可以了，f(n)=9<=9*1。

 

Ω符号
f(n)=Ω(g(n))，当且仅当存在正的常数c和n0，使得对于所有n>=n0，有f(n)>=cg(n)。
Ω符号是给函数的下限。
例子
对于所有的n，有f(n)=3n+2>3n，所以f(n)=Ω(n)，这里c=3，n0=0。这里也可以这样f(n)=Ω(1)，
但是这个精确度貌似也太坑爹了。
比分析函数上限简单些。

 

Θ符号
对于存在大于0的常数c1、c2和非负的整数n0，以及足够大的n，对于所有的n≥n0来说，有c1g(n)<=f 
(n)<=c2g(n)。
3n+2=Θ(n)，当c1=3,c2=4，n>=n0=2时，3n<=3n+2<=4n。

 

小写o符号
定义:f(n)=o(g(n))当且仅当f(n)=O(g(n))且f(n)!=Ω(g(n))。