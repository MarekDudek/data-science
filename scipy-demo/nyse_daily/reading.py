from zipfile import ZipFile
import pandas as pd


def read_zip_with_csv(path):
    zip_file = ZipFile(path)
    dfs = [pd.read_csv(zip_file.open(zip_info.filename)) for zip_info in zip_file.infolist()]
    return pd.concat(dfs)

def read_zips_with_csv(paths):
    pass