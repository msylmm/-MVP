#UserOnloginMvp
##简介
###一个简单的用户登录MVP示例
###*引言

- MVC时代：在MVC模型里，更关注的Model的不变，业务需求通常是Model不变，同时有多个对Model的不同显示，即View。所以，在MVC模型里，Model不依赖于View，但是View是依赖于Model的。 不仅如此，因为有一些业务逻辑在View里实现了，导致要更改View也是比较困难的，至少那些业务逻辑是无法重用的。

+ MVP时代：在MVP里，Presenter完全把Model和View进行了分离，主要的程序逻辑在Presenter里实现。而且，Presenter与具体的View是没有直接关联的，而是通过定义好的接口进行交互（单独测试时我们只需要按照接口传递参数即可），从而使得在变更View时候可以保持Presenter的不变，即重用！ 不仅如此，我们还可以编写测试用的View，模拟用户的各种操作，从而实现对Presenter的测试--而不需要使用自动化的测试工具

* MVP解耦View时代：以往我们的V层是一个Activity或Frament实现，大多数情况下，我们的一个页面布局很复杂,包含很多个ViewGroup,而不是简单的一个ListView、GridView，按照之前的会发现一个Activity中有很多Presenter来维护和很多的回调，有时我们只需要改动其中的一个ViewGroup内容逻辑，却不能很好的区分，所以我们要让每个View或者ViewGroup实现MVP，这样不管这个View放在哪(Activity/Fragment/ViewGroup)都能够很好的移植，并且修改某一个的时候也会互相不影响，所以通过LifeCycle和组件化View可以很好解决上面问题

QQ群 806248089

###内容 
- 简单的用户登陆