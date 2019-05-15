1. 构建镜像
> docker build -t omar/base-web:1.0 .

2. 运行镜像
> docker run -d -p 8080:8080 omar/base-web:1.0

3. 验证功能
> http://172.19.34.72:8080/book?id=2