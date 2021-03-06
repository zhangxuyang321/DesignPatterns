# 原型模式

## 目的

> 使用原型实例指定要创建对象的种类,并通过复制此原型来创建新的对象

## 解释说明

### 真实世界的例子

> 还记得克隆羊多莉吗? 我们不必了解细节,原型模式的关键在于它是关于克隆的

### 简单来说

> 通过克隆创建出基于现有对象的对象

### 维基百科

> 在软件开发中,原型模式属于创建类型的设计模式.当要创建的对象的类型由原型实例确定时,
它将被克隆以生成新的对象

简而言之,它允许你创建现有对象的副本并根据需要修改,而不是从头开始创建对象并进行设置.

## 具体代码

见createType/protoType

## 适用场景

当系统应独立于其产品的创建,组合和代表的方式时,适用原型模式;并且

* 运行时实例化指定的类.例如动态加载
* 避免建立与产品类层次结构相似的工厂类的层次结构
* 当一个类的实例有几种不同的组合状态时,使用原型模式克隆对应的实例.这样比手动的根据状态从新实例化更方便.
* 当创建一个类比克隆消耗资源更多的时候