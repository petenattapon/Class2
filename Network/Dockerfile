# # เลือก base image ที่มี Java Development Kit (JDK)
# FROM openjdk:11-jdk

# # กําหนดพาธเริ่มต้นของแอปพลิเคชันใน container
# WORKDIR /app

# # คัดลอกไฟล์ .java และไฟล์ที่จําเป็นในการรันโปรแกรม Java ไปยัง container
# COPY Main.java /app/Main.java

# # compile และรันโปรแกรม Java ใน container
# RUN javac Main.java

# # กําหนดคําสั่ง default ที่จะรันเมื่อเราสร้าง container จาก image นี้
# CMD ["java", "Main"]


# ใช้ base image ของ OpenJDK ที่เป็น Java runtime environment
FROM openjdk:11-jdk

# สร้างโฟลเดอร์ app และกำหนดให้เป็น working directory
WORKDIR /app

# คัดลอกไฟล์ทั้งหมดในโฟลเดอร์ปัจจุบันไปยังโฟลเดอร์ /app ใน Docker image
COPY . /app

# รันคำสั่งสร้าง bytecode ของโปรแกรม Java
RUN javac Main.java

# รันโปรแกรม Java โดยใช้คำสั่ง java Main
CMD ["java", "Main"]
