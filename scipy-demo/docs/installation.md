# Installing/upgrading pip and virtualenv

```
python3 -m pip --version
python3 -m pip install --user --upgrade pip
python3 -m pip install --user virtualenv
```

# Creating environment

```
python3 -m venv ${env-name}
which python
which pip
pip install --upgrade pip
```

# Activating/deactivating environment
```
source env/bin/activate
deactivate
```

# Installing packages

```
pip install ${name}
pip install ${name}=a.b.c
pip install ${name}>=a.b.c,<d.e.f
pip install --pre ${name}
```

# Upgrading packages

```
pip install --upgrade ${name}
```
```
pip install --upgrade tensorflow
pip install --upgrade keras
pip install --upgrade pandas
pip install --upgrade numpy
pip install --upgrade matplotlib
pip install --upgrade Jupyter
pip install -U scikit-learn
```
