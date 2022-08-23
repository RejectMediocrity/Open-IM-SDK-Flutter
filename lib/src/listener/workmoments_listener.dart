/// 朋友圈监听
class OnWorkMomentsListener {
  Function(String)? onRecvNewNotification;

  OnWorkMomentsListener({this.onRecvNewNotification});

  /// 朋友圈信息发送改变
  void recvNewNotification(String type) {
    onRecvNewNotification?.call(type);
  }
}
