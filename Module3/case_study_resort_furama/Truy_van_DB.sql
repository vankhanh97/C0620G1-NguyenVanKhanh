-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *
FROM nhan_vien
WHERE
    ho_ten REGEXP '\\s[HTK]\\w+$';
    
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from khach_hang
where (dia_chi = 'Quảng trị' or dia_chi = 'Đà Nẵng')and (year(now())-year(ngay_sinh))>18 ;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select  count(l.id_loai_khach) as 'đếm số lượng đặt phòng',k.ho_ten ,l.ten_loai_khach
from khach_hang k
left join hop_dong h on k.id_khach_hang = h.id_hop_dong  
left join loai_khach l on k.id_loai_khach = l.id_loai_khach
where l.ten_loai_khach = 'Diamond' 
group by k.id_khach_hang
order by 'đếm số lượng đặt phòng';

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select k.id_khach_hang,k.ho_ten,loai_khach.ten_loai_khach,hd.id_hop_dong,dv.ten_dich_vu,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc-- ,sum(dv.chi_phi_thue+hop_dong_chi_tiet.so_luong*dvdk.gia)
from khach_hang k
 join loai_khach on loai_khach.id_loai_khach = k.id_loai_khach
 join hop_dong hd on hd.id_khach_hang = k.id_khach_hang
 join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
 join hop_dong_chi_tiet on hd.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
 join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem;
