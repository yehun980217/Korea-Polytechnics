# **TensorFlow 환경 설정 및 문제 해결 가이드**

## **📌 시스템 환경 정보**
- **OS:** Windows 10/11
- **Python 버전:** 3.7
- **TensorFlow 버전:** 2.10.0 (Python 3.7과 호환되는 마지막 버전)
- **CUDA:** 없음 (CPU 사용)
- **가상 환경:** `venv`

---

## **⚠️ 발생한 문제 및 원인**

### **1️⃣ TensorFlow 2.11 이상 설치 시 오류 발생**
**오류 메시지:**
```
ImportError: cannot import name 'OrderedDict' from 'typing'
```

**원인:**
- Python 3.7에서는 TensorFlow 2.11 이상을 지원하지 않음.
- TensorFlow 2.11부터는 **Python 3.8 이상이 필요**.

**해결 방법:**
```bash
pip uninstall tensorflow
pip install tensorflow==2.10.0
```

---

### **2️⃣ TensorFlow 관련 패키지 의존성 충돌**
**오류 메시지:**
```
tensorflow-intel 2.11.0 requires keras<2.12,>=2.11.0, but you have keras 2.10.0 which is incompatible.
```

**원인:**
- `pip install tensorflow` 실행 시 **`tensorflow-intel` 2.11.0**이 자동 설치됨.
- `tensorflow-intel`과 `tensorflow` 패키지 충돌 발생.

**해결 방법:**
```bash
pip uninstall tensorflow tensorflow-intel keras tensorboard tensorflow-estimator
pip install tensorflow==2.10.0 keras==2.10.0 tensorboard==2.10.1 tensorflow-estimator==2.10.0
```

자동 업그레이드 방지:
```bash
pip install --no-deps tensorflow==2.10.0
```

---

### **3️⃣ cudart64_110.dll not found (GPU 관련 경고 메시지)**
**오류 메시지:**
```
Could not load dynamic library 'cudart64_110.dll'; dlerror: cudart64_110.dll not found
```

**원인:**
- TensorFlow가 **GPU 지원을 활성화하려고 하지만, CUDA 라이브러리가 없음.**
- Windows에서는 GPU 없이 실행해도 해당 경고가 발생할 수 있음.

**해결 방법:**
#### ✅ **1) TensorFlow를 CPU 모드로 강제 실행**
Python 코드 최상단에 다음 코드 추가:
```python
import os
os.environ["CUDA_VISIBLE_DEVICES"] = "-1"
```
이렇게 하면 TensorFlow가 **GPU를 시도하지 않고 CPU만 사용하도록 강제됨.**

#### ✅ **2) GPU 버전이 아닌 CPU 버전 TensorFlow 설치**
```bash
pip uninstall tensorflow
pip install tensorflow-cpu==2.10.0
```

---

## **✅ 최종 환경 설정 (정리)**
### **📌 설치 명령어**
```bash
# 1. 기존 TensorFlow 및 관련 패키지 삭제
pip uninstall tensorflow tensorflow-intel keras tensorboard tensorflow-estimator

# 2. Python 3.7과 호환되는 TensorFlow 2.10.0 설치
pip install tensorflow==2.10.0 keras==2.10.0 tensorboard==2.10.1 tensorflow-estimator==2.10.0

# 3. TensorFlow CPU 모드 강제 설정 (GPU 경고 제거)
python -c "import os; os.environ['CUDA_VISIBLE_DEVICES'] = '-1'"
```

### **📌 실행 시 버전 확인**
```python
import tensorflow as tf
print(tf.__version__)  # 2.10.0
```

이제 TensorFlow 2.10.0이 정상적으로 실행됩니다! 🚀

