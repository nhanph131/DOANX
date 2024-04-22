package enum_pack;

public class enums {
	public enum mode{
		login,
		signup
	}
	public enum taskState {
		completed, 	// hoàn thành
		ongoing, 	// đang làm
		overdue, 	// quá hạn
		cancelled, 	// bỏ
		notstart,	// chưa bắt đầu
		pending		// tạm ngưng
	}

	public enum taskPriority{
		urgent,		// khẩn cấp ,cần làm ngay trong ngày
		high,		// cao, cần xử lý trong 2-3 ngày
		medium,		// trung bình, xử lý trong 3-4 ngày
		low			// thấp, không yêu cầu thời gian
	}
}
