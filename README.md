**注：由于maven出现BUG，考虑到时间问题，此项目并没有用maven风格**

**项目为Java Web项目，使用后端框架SSM搭建**

1.使用了额外Jar包MD5：在数据库保存的密码使用了MD5加密。

2.安全性：数据库的密码保存采用MD5加密，防止密码直接泄露；在输入密码时点击显示密码，密码显示2秒后变回隐藏状态。

3.用户体验：在登录失败时有明显的提示信息，告诉用户是用户名不存在还是密码出现问题；用户在输入密码时可以显示密码。
