# 组合模式

## 目的

> 将对象组合到树结构中,以表示"部分-整体"的层次结构.组合模式使客户端
能够统一对待类或类的组成

## 解释说明

### 真实世界例子

> 每个句子都是有组成单词的字符组成的.这些句子中的每一个单词都是可以打印
的.可以在它们之前之后打印出一些东西,因为句子总是以完全停止的方式结束,而
在它之前总是有空格.

### 简单来说
> 组合模式让用户可以统一的对待每一个对象

### 维基百科

> 在软件工程中,组合模式是一种结构划分的设计模式.组合模式描述了一组对象的
处理方式与对象的单个实例相同.组合模式的目的是将对象组合成树结构以方便的表
示"部分-整体"结构.运用组合模式,可以让用户统一的处理单个对象和组合.


## 具体代码

让我们实现前面说的句子的例子.代码见structureType/composite

## 适应场景

* 你想要表示对象的部分整体层次结构
* 您希望用户能够忽略对象和单个对象的组合之间的差异。客户将统一地处理组合结构中的所有对象