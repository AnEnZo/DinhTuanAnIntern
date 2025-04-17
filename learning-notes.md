# Ghi chú học tập các kiến thức đã học được
# 📘 Learning Notes – Java Intern
## 🗓️ Tuần 1: Java Core – Cú pháp & Tư duy lập trình cơ bản
### 🧠 Mục tiêu:
- Làm quen với Java và tư duy logic.
- Viết được chương trình Java đơn giản.

### 🔍 Nội dung đã học:
- Cài đặt JDK, IntelliJ, Git.
- Cấu trúc chương trình Java (`main`, `package`, `comment`).
- Biến, hằng số, kiểu dữ liệu nguyên thủy.
- Toán tử số học, quan hệ, logic.
- Câu lệnh điều kiện: `if`, `switch`.
- Vòng lặp: `for`, `while`, `do-while`.
- Nhập xuất với `Scanner`, `System.out`.

### 💡 Demo đã thực hiện:
- Viết ứng dụng máy tính cơ bản (tính cộng, trừ, nhân, chia).

## 🗓️ Tuần 2: Java OOP – Lập trình hướng đối tượng

### 🧠 Mục tiêu:
- Hiểu được cấu trúc hướng đối tượng.
- Biết thiết kế lớp và sử dụng đối tượng.

### 🔍 Nội dung đã học:
- Class và Object.
- Từ khóa `this`, `static`, `final`.
- Constructor và Overloading.
- Kế thừa (`extends`), ghi đè phương thức (`@Override`).
- Polymorphism và Abstraction.
- Đóng gói (`Encapsulation`) và `Access Modifier`.
- `Interface` và `Abstract class`.

### 💡 Demo đã thực hiện:
- Quản lý sinh viên:
    - Class `Person` (tên, tuổi).
    - Class `Student` kế thừa từ `Person`, thêm điểm, phương thức tính học lực.

### ❗ Ghi chú:
- Nắm rõ 4 tính chất OOP.
- Phân biệt được abstract class và interface.
---
🗓️ Tuần 3: Collection, Exception, String, DateTime
🧠 Mục tiêu:
Làm việc được với tập hợp dữ liệu và xử lý ngoại lệ trong Java.

🔍 Nội dung đã học:
Collection:

Sử dụng ArrayList, HashSet, HashMap để lưu trữ và truy xuất dữ liệu.

Duyệt qua collection bằng for, foreach, và Iterator.

Exception Handling:

Cấu trúc try-catch-finally để xử lý lỗi.

Tạo ngoại lệ với throw, và xử lý ngoại lệ khai báo với throws.

String Manipulation:

Làm việc với chuỗi: split, substring, replace, equals, contains.

Tối ưu hiệu năng xử lý chuỗi với StringBuilder.

DateTime API:

Làm việc với LocalDate, LocalDateTime.

Định dạng và chuyển đổi chuỗi ngày tháng với DateTimeFormatter.

💡 Demo đã thực hiện:
Ứng dụng Todo List:

Thêm, xoá, cập nhật công việc theo ngày.

Lưu trữ danh sách công việc bằng ArrayList.

Xử lý ngày tháng với LocalDate, định dạng đầu ra với DateTimeFormatter.

Bắt lỗi nhập sai định dạng với try-catch.

🗓️ Tuần 4: Clean Code, SOLID, Design Pattern cơ bản
🧠 Mục tiêu:
Viết code rõ ràng, dễ bảo trì và có khả năng mở rộng tốt.

🔍 Nội dung đã học:
Clean Code:

Đặt tên biến/hàm dễ hiểu.

Tách hàm nhỏ, rõ mục đích.

Tuân thủ nguyên tắc DRY (Don't Repeat Yourself).

Nguyên lý SOLID:

S - Single Responsibility: Mỗi class chỉ đảm nhiệm một chức năng.

O - Open/Closed: Mở rộng được mà không sửa code cũ.

L - Liskov Substitution: Class con có thể thay thế class cha.

I - Interface Segregation: Interface nhỏ, chuyên biệt.

D - Dependency Inversion: Phụ thuộc vào abstraction, không phụ thuộc implementation cụ thể.

Design Pattern cơ bản:

Singleton: Chỉ tạo một instance duy nhất cho class.

Factory: Tạo đối tượng mà không cần biết class cụ thể.

Strategy: Thay đổi hành vi runtime linh hoạt.

Observer: Theo dõi và phản ứng khi dữ liệu thay đổi.

💡 Demo đã thực hiện:
Ứng dụng tạo phương tiện:

Sử dụng Factory Pattern để tạo Xe máy, Xe đạp, Xe hơi.

Áp dụng OCP để mở rộng dễ dàng khi thêm loại xe mới.

Sử dụng interface để thể hiện hành vi linh hoạt cho từng loại xe.

Đảm bảo mỗi class chỉ có một trách nhiệm rõ ràng (SRP).

✅ Tổng kết sau 4 tuần:
Hiểu và sử dụng thành thạo Java Collection, xử lý lỗi, chuỗi và ngày tháng.

Nắm được tư duy Clean Code, SOLID để viết code chất lượng hơn.

Bắt đầu áp dụng được các Design Pattern cơ bản trong dự án nhỏ.

