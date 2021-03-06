# 中介者模式

## 目的
> 定义一个封装了一组对象如何交互的对象。中介通过使对象不显式地相互引
用来促进松散耦合，并且允许您独立地更改它们的交互。

![mediator](mediator.png)

## 适用场景

* 一组对象以明确但复杂的方式进行通信。由此产生的相互依赖性是非结构
化的，难以理解

* 重用对象是很困难的，因为它涉及许多其他对象并与之通信

* 在几个类之间分布的行为应该是可定制的，而不需要很多子类化