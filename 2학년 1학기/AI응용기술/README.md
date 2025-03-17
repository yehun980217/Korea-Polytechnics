# **TensorFlow 설치 및 문제 해결**

## **📌 오류 원인**
1. **Python 3.7에서 TensorFlow 2.11 이상 실행 불가**
   - Python 3.7은 TensorFlow 2.11 이상을 지원하지 않음.
   
2. **패키지 의존성 충돌 발생**
   - `tensorflow-intel`이 자동 설치되면서 기존 패키지들과 버전 충돌.

---

## **✅ 해결 방법**
### **1️⃣ 올바른 버전의 TensorFlow 및 종속 패키지 설치**
```bash
pip uninstall tensorflow tensorflow-intel keras tensorboard tensorflow-estimator
pip install --no-deps tensorflow==2.10.0 keras==2.10.0 tensorboard==2.10.1 tensorflow-estimator==2.10.0
```

### **2️⃣ 설치 후 버전 확인**
```python
import tensorflow as tf
print(tf.__version__)  # 2.10.0
```

