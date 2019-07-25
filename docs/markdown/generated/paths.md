
<a name="paths"></a>
## 资源

<a name="example_resource"></a>
### Example
swagger示例接口


<a name="queryusingget"></a>
#### 通过userId搜索User
```
GET /api/query/{userId}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|userId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[User](#user)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json`


##### HTTP请求示例

###### 请求 path
```
/api/query/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "name" : "string",
  "userId" : 0
}
```



